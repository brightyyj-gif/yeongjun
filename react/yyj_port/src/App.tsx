/**
 * @license
 * SPDX-License-Identifier: Apache-2.0
 */

import React, { useState } from 'react';
import { Header } from './components/Header';
import { Hero } from './components/Hero';
import { ProjectsSection } from './components/ProjectsSection';
import { InteractiveLab } from './components/InteractiveLab';
import { PhilosophySection } from './components/PhilosophySection';
import { ExperienceSection } from './components/ExperienceSection';
import { AboutSection } from './components/AboutSection';
import { ContactSection } from './components/ContactSection';
import { ResumeDrawer } from './components/ResumeDrawer';
import { Footer } from './components/Footer';

export default function App() {
  const [isResumeOpen, setIsResumeOpen] = useState(false);
  const [isContactModalOpen, setIsContactModalOpen] = useState(false);

  return (
    <div className="min-h-screen bg-[#0c0d12] text-[#e2e4ea] flex flex-col font-sans selection:bg-indigo-600/30 selection:text-indigo-200">
      {/* 3-Zone Contract Top Navigation */}
      <Header
        onOpenResume={() => setIsResumeOpen(true)}
        onOpenContact={() => setIsContactModalOpen(true)}
      />

      <main className="flex-1">
        {/* Hero Section */}
        <Hero
          onOpenResume={() => setIsResumeOpen(true)}
          onOpenContact={() => setIsContactModalOpen(true)}
        />

        {/* 01. Featured Works & Case Studies */}
        <ProjectsSection />

        {/* 02. Interactive Frontend Lab */}
        <InteractiveLab />

        {/* 03. Engineering Philosophy & Principles */}
        <PhilosophySection />

        {/* 04. Work Experience & Career */}
        <ExperienceSection />

        {/* 05. Engineering Mindset & FAQ */}
        <AboutSection />

        {/* 06. Get In Touch & Inquiries */}
        <ContactSection />
      </main>

      {/* Footer */}
      <Footer />

      {/* Modals & Drawers */}
      <ResumeDrawer
        isOpen={isResumeOpen}
        onClose={() => setIsResumeOpen(false)}
      />

      {isContactModalOpen && (
        <ContactSection
          isOpenModal={true}
          onCloseModal={() => setIsContactModalOpen(false)}
        />
      )}
    </div>
  );
}
