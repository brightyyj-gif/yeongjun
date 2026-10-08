import React, { useState } from 'react';
import { Menu, X, ArrowUpRight, FileText, Send } from 'lucide-react';

interface HeaderProps {
  onOpenResume: () => void;
  onOpenContact: () => void;
}

export const Header: React.FC<HeaderProps> = ({ onOpenResume, onOpenContact }) => {
  const [mobileMenuOpen, setMobileMenuOpen] = useState(false);

  const navLinks = [
    { label: 'Works', href: '#works' },
    { label: 'Philosophy', href: '#philosophy' },
    { label: 'Frontend Lab', href: '#lab' },
    { label: 'Experience', href: '#experience' },
    { label: 'About', href: '#about' },
  ];

  return (
    <header className="sticky top-0 z-40 w-full border-b border-white/[0.08] bg-[#0c0d12]/80 backdrop-blur-md">
      <div className="mx-auto flex h-16 max-w-7xl items-center justify-between px-4 sm:px-6 lg:px-8">
        {/* Zone 1: Single text element wordmark */}
        <a
          href="#"
          className="text-lg font-bold tracking-tight text-white transition-colors hover:text-indigo-400 focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-indigo-400"
        >
          Yeongjun Yang
        </a>

        {/* Zone 2: 4-6 clean text navigation links */}
        <nav className="hidden items-center gap-7 text-sm font-medium text-zinc-400 md:flex">
          {navLinks.map((item) => (
            <a
              key={item.href}
              href={item.href}
              className="transition-colors hover:text-white"
            >
              {item.label}
            </a>
          ))}
        </nav>

        {/* Zone 3: 1-2 primary actions */}
        <div className="hidden items-center gap-3 md:flex">
          <button
            onClick={onOpenResume}
            className="flex items-center gap-1.5 px-3 py-1.5 text-xs font-medium text-zinc-300 transition-colors hover:text-white hover:bg-white/[0.06] rounded-md focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-indigo-400 whitespace-nowrap"
          >
            <FileText className="h-3.5 w-3.5 text-zinc-400" />
            <span>이력서</span>
          </button>
          <button
            onClick={onOpenContact}
            className="flex items-center gap-1.5 rounded-md bg-indigo-600 px-3.5 py-1.5 text-xs font-medium text-white transition-all hover:bg-indigo-500 active:scale-[0.98] focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-indigo-400 whitespace-nowrap shadow-sm shadow-indigo-600/30"
          >
            <Send className="h-3.5 w-3.5" />
            <span>Contact</span>
          </button>
        </div>

        {/* Mobile menu trigger */}
        <div className="flex items-center gap-2 md:hidden">
          <button
            onClick={() => setMobileMenuOpen(!mobileMenuOpen)}
            className="p-2 text-zinc-400 hover:text-white focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-indigo-400"
            aria-label="Toggle navigation menu"
          >
            {mobileMenuOpen ? <X className="h-5 w-5" /> : <Menu className="h-5 w-5" />}
          </button>
        </div>
      </div>

      {/* Mobile drop menu */}
      {mobileMenuOpen && (
        <div className="border-b border-white/[0.08] bg-[#0c0d12] px-6 py-4 md:hidden">
          <div className="flex flex-col space-y-3">
            {navLinks.map((item) => (
              <a
                key={item.href}
                href={item.href}
                onClick={() => setMobileMenuOpen(false)}
                className="py-1 text-sm font-medium text-zinc-300 hover:text-white"
              >
                {item.label}
              </a>
            ))}
            <div className="pt-3 border-t border-white/[0.08] flex items-center gap-2">
              <button
                onClick={() => {
                  setMobileMenuOpen(false);
                  onOpenResume();
                }}
                className="flex-1 py-2 text-xs font-medium text-zinc-300 bg-white/[0.05] rounded-md text-center hover:bg-white/[0.1]"
              >
                이력서 확인
              </button>
              <button
                onClick={() => {
                  setMobileMenuOpen(false);
                  onOpenContact();
                }}
                className="flex-1 py-2 text-xs font-medium text-white bg-indigo-600 rounded-md text-center hover:bg-indigo-500"
              >
                연락하기
              </button>
            </div>
          </div>
        </div>
      )}
    </header>
  );
};
